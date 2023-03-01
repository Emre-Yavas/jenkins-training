def call(String name = 'human') {
    def resource = libraryResource "src/org/foo/class.groovy"
    echo foo
    echo "Hello, ${name}."
}
