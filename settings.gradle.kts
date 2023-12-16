rootProject.name = "ssulzone"

include("ssulzone-common")
include("ssulzone-domain")
include("ssulzone-usecase")

// infrastructure
include(":ssulzone-infrastructure-persistence")
project(":ssulzone-infrastructure-persistence").projectDir = file("ssulzone-infrastructure/persistence")

include(":ssulzone-infrastructure-http")
project(":ssulzone-infrastructure-http").projectDir = file("ssulzone-infrastructure/http")

include(":ssulzone-infrastructure-redis")
project(":ssulzone-infrastructure-redis").projectDir = file("ssulzone-infrastructure/redis")

// bootstrap
include(":ssulzone-bootstrap-api")
project(":ssulzone-bootstrap-api").projectDir = file("ssulzone-bootstrap/api")

include(":ssulzone-bootstrap-batch")
project(":ssulzone-bootstrap-batch").projectDir = file("ssulzone-bootstrap/batch")
