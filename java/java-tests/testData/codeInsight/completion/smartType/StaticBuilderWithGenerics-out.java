public class S {

  {
    Map<String, Object> m = Map.<String, Object>builder()<caret>.get();
  }

}

class Map<K,V> {
  static <K,V> Builder<K,V> builder() {}

  static class Builder<K,V> {
    Map<K,V> get() {}
    Map<K,V> get(int x) {}
  }
}