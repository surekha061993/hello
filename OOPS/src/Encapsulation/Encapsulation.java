package Encapsulation;

public class Encapsulation {
	     
	     public int eid;
         private int id;
         
         private String name;
         
         private String address;

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getAddress() {
			return address;
		}

		public void setAddress(String address) {
			this.address = address;
		}
         
         @Override
		public String toString() {
			return "Encapsulation [eid=" + eid + ", id=" + id + ", name=" + name + ", address=" + address + "]";
		}

		public static void main(String[] args) {
			Encapsulation enc=new Encapsulation();
			enc.eid=111;//public not access setter and getter
			enc.id=99;//private access setter and getter
			enc.setId(11);
			System.out.println(enc);
		}
}
