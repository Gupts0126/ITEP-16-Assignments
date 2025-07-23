/*19. A cube with an edge of 7 cm and a cuboid measuring 7 cm × 4 cm × 8 am are kept on a table. 
Which shape has more volume?*/


class Program19{
    public static void main(String args[]){

      int edge_of_cube = 7;
      int length_of_cuboid = 7;
      int breadth_of_cuboid = 4;
      int height_of_cuboid = 8;

      float volume_of_cube = edge_of_cube * edge_of_cube * edge_of_cube;
      float volume_of_cuboid = length_of_cuboid * breadth_of_cuboid * height_of_cuboid; 

        if(volume_of_cube > volume_of_cuboid){
        System.out.println("The cube has more volume");
       }
       else{
        System.out.println("The cuboid has more volume");
       }
    }

       
    }

