package com.rain.plugin.lib

import com.rain.plugin.lib.extension.RainExtension
import org.gradle.api.Plugin
import org.gradle.api.Project

class RainBuildSrc implements Plugin<Project> {
    public static final String RAIN_EXTENSION_NAME = 'rain'

    @Override
    void apply(Project project) {
        project.extensions.create(RAIN_EXTENSION_NAME,RainExtension)
        project.task('rainTask')<<{
            if (project.rain.message == null){
                println 'la la'
            }else{
                println project.rain.message
            }

        }
    }
}