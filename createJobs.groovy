pipelineJob('myspringapp') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url 'https://github.com/eduardboamba/myspringapp.git'
                    }
                    branch 'master'
                }
            }
        }
    }
}
