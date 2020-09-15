
public class disk {
	 
	        private int size;

	        disk(int size){
	            this.size = size;
	        }
	        public void draw(){
	            for(int i=0; i<size; i++){
	                System.out.print("-");  // we use print so that the next one will draw on the same line.
	            }

	            System.out.println("");     // we will move to the next line.
	        }
	    }


