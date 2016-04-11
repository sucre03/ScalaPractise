val dogBreeds = List("Doberman", "Yorkshire Terrier", "Dachshund",
  "Scottish Terrier", "Great Dane", "Portuguese Water Dog")
val filteredBreeds = for{
    breed<-dogBreeds
    if breed.contains("Terrier") && !breed.startsWith("Yorkshire")
} yield breed
/*
for 推导式有一个不成文的约定：
当 for 推导式仅包含单一表达式时使用原括号，
当其包含多个表达式时使用大括号。
 */


//for的推导式,在for最初部分定义值,可以在for后面的表达式使用
for{
  breed<-dogBreeds
  upcaseBreed =breed.toUpperCase
} println(upcaseBreed)

