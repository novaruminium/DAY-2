rootProject.name = "MODULE-1"
include("src:main:TEST-2")
findProject(":src:main:TEST-2")?.name = "TEST-2"
include("src:TEST-2")
findProject(":src:TEST-2")?.name = "TEST-2"
