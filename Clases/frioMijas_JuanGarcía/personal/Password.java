package Clases.frioMijas_JuanGarcía.personal;

class Password {
  private String password;

  public Password() {
    this.password = "";
    this.generaPassword();
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public void generaPassword() {
    String str = "";

    for (int i = 0; i < 8; i++) {
      str += (char) (Math.random() * 94 + 33);
    }

    password = str;
  }

  public void generaPassword(int len) {
    String str = "";

    for (int i = 0; i < len; i++) {
      str += (char) (Math.random() * 94 + 33);
    }

    password = str;
  }

  public boolean esFuerte() {
    int contMayus = 0;
    int contNums = 0;
    int contMinus = 0;

    for (int i = 0; i < password.length(); i++) {
      if ((char) password.charAt(i) >= 65 && (char) password.charAt(i) <= 90)
        contMayus++;
      if ((char) password.charAt(i) >= 97 && (char) password.charAt(i) <= 122)
        contMinus++;
      if ((char) password.charAt(i) >= 48 && (char) password.charAt(i) <= 57)
        contNums++;
    }

    return (contMayus > 2 && contNums > 5 && contMinus > 1);
  }

  @Override
  public String toString() {
    return "Password [password=" + password + "]";
  }

}
