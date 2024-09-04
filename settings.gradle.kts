rootProject.name = "MODULE-1"
include("src:main:TEST-2")
findProject(":src:main:TEST-2")?.name = "TEST-2"
include("src:TEST-2")
findProject(":src:TEST-2")?.name = "TEST-2"
include("src:exercise-3")
findProject(":src:exercise-3")?.name = "exercise-3"
include("src:exercise-2")
findProject(":src:exercise-2")?.name = "exercise-2"
