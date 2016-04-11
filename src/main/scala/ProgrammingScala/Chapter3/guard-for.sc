val dogBreeds = List("Doberman", "Yorkshire Terrier", "Dachshund",
  "Scottish Terrier", "Great Dane", "Portuguese Water Dog")
for(bread<-dogBreeds
   if bread.contains("Dane")
) println(bread)

for(bread<-dogBreeds
    if bread.contains("Terrier")
    if !bread.startsWith("D")
) println(bread)

for(bread<-dogBreeds
    if bread.contains("Terrier") && !bread.startsWith("D")
) println(bread)