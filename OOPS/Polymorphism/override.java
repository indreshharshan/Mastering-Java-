class override {
    int num;
  
  public override(int num){
    this.num=num;
  }
    @Override
    public String toString() {
        return "override{" + "num=" + num + '}';
    }

    public static void main(String[] args) {
        override obj = new override(26);

        System.out.println(obj);
    }
}