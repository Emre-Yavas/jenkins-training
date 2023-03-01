def call(String name = 'human') {
    def resource = libraryResource "src/org/foo/test.groovy"
    echo foo
    echo "Hello, ${name}."
}
