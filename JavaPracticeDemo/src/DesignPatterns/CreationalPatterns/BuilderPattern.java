package DesignPatterns.CreationalPatterns;

public class BuilderPattern {
	static class Coffee{
		private String type;
		private boolean sugar;
		private String size;
		private boolean milk;

		private Coffee(Builder builder)
		{
			this.type=builder.type;
			this.sugar=builder.sugar;
			this.size=builder.size;
			this.milk=builder.milk;
		}
		public static class Builder{
			private String type;
			private boolean sugar;
			private String size;
			private boolean milk;

			public Builder(String type)
			{
				this.type=type;
			}
			
			public Builder sugar(boolean sugar)
			{
				this.sugar=sugar;
				return this;
			}
			public Builder size(String size)
			{
				this.size=size;
				return this;
			}
			public Builder milk(boolean milk)
			{
				this.milk=milk;
				return this;
			}
			
			public Coffee build() {
				return new Coffee(this);
			}
		}
		@Override
		public String toString() {
			return "Coffee [type=" + type + ", sugar=" + sugar + ", size=" + size + ", milk=" + milk + "]";
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Coffee coffee=new BuilderPattern.Coffee.Builder("Espresso").milk(true).size("Grande").sugar(true).build();
		System.out.println(coffee.toString());

	}

}
