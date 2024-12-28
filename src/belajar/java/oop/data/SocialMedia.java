package belajar.java.oop.data;

class SocialMedia {
  String name;
}

final class Facebook extends SocialMedia {

}

// Error: Cannot inherit from final class
//class FakeFacebook extends Facebook {
//
//}

class Instagram extends SocialMedia {
  final void login(String username, String password) {
    // Isi method
  }
}

class FakeInstragram extends Instagram {

//  Error: Cannot override final method
//  @Override
//  void login(String username, String password) {
//    super.login(username, password);
//  }
}

