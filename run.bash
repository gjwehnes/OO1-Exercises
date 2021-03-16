echo "compile exercises"
javac -classpath .:/run_dir/junit-4.12.jar:/run_dir/hamcrest-core-1.3.jar:/run_dir/json-simple-1.1.1.jar  src/ex001/*.java  src/ex002/*.java src/ex003/*.java src/ex004/*.java src/ex005/*.java src/ex006/*.java src/ex007/*.java src/ex008/*.java src/ex009/*.java src/ex010/*.java src/ex011/*.java src/ex012/*.java src/ex013/*.java src/ex014/*.java -d ./bin
echo "compile Main"
javac -classpath .:/run_dir/junit-4.12.jar:/run_dir/hamcrest-core-1.3.jar:/run_dir/json-simple-1.1.1.jar src/*.java -d ./bin
echo "run Main.java"
java -classpath .:/run_dir/junit-4.12.jar:/run_dir/hamcrest-core-1.3.jar:/run_dir/json-simple-1.1.1.jar:./bin Main
