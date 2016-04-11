import java.io.{FileInputStream, BufferedInputStream, File}

abstract class BulkReader{
  type In
  val source:In
  def read:String //读进source,然后返回一个String
}

class StringBulkReader(val source:String) extends BulkReader{
  type In = String
  def read:String =source
}
class FileBulkReader(val source:File){
      type In = File
      def read:String={
        val in = new BufferedInputStream(new FileInputStream(source))
        val numBytes = in.available()
        val bytes = new Array[Byte](numBytes)
        in.read(bytes,0,numBytes)
        new String(bytes)
      }
}
println(new StringBulkReader("Hello Scala").read)
println(new FileBulkReader(new File("ProgrammingScala/Chapter2/abstract-types.sc")).read)