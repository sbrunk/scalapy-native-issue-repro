import me.shadaj.scalapy.py

@py.native trait PyString extends py.Object {
  def count(subsequence: String): Int = py.native
}
