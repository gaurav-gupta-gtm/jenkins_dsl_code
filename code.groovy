job('example') {
    description('My first job')
    steps {
        shell('sh /jobcode/code.sh')
    }
}