package org.springframework.samples.petclinic.graphql.config;

import graphql.analysis.MaxQueryComplexityInstrumentation;
import graphql.analysis.MaxQueryDepthInstrumentation;
import graphql.execution.instrumentation.Instrumentation;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MaxQueryControlConfig {

//    @Bean
//    public Instrumentation getMaxQueryDepthInstrumentation(){
//        return new MaxQueryDepthInstrumentation(5);
//    }

    @Bean
    public Instrumentation getMaxQueryComplexityInstrumentation(){
        return new MaxQueryComplexityInstrumentation(100);
    }

}
