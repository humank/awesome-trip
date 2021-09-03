package com.camelot.awesometrip;

import com.tngtech.archunit.junit.AnalyzeClasses;
import com.tngtech.archunit.junit.ArchTest;
import com.tngtech.archunit.lang.ArchRule;

import static com.tngtech.archunit.library.Architectures.layeredArchitecture;

@AnalyzeClasses(packages = "com.camelot.awesometrip.core.trip.models")
public class LayeredArchitectureTest {
    @ArchTest
    static final ArchRule layer_dependencies_are_respected = layeredArchitecture()

            .layer("DomainModels").definedBy("com.camelot.awesometrip.core.trip.models..")
            .layer("DDDCommons").definedBy("com.camelot.dddcommons.baseclasses..")
            .layer("JavaRuntime").definedBy("java.lang..")
            //.whereLayer("DomainModels").mayOnlyAccessLayers("DomainModels,DDDCommons");
            .whereLayer("DomainModels").mayOnlyAccessLayers("DomainModels","DDDCommons","JavaRuntime");

}