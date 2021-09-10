package com.github.1040322934.testtemplate.services

import com.intellij.openapi.project.Project
import com.github.1040322934.testtemplate.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
