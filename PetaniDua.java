
package UTS;

public class PetaniDua {

    public static void main(String[] args) {
         String[] boxOfUnorganizedFruits = {
      "Durian",
      "Salak",
      "Semangka",
      "Jeruk",
      "Nangka",
      "Melon",
      "Srikaya",
    };

    int boxIndex = 0;
    int containerBoxIndex = 0;
    int boxSize = boxOfUnorganizedFruits.length;

    String[] boxOfOrganizedFruits = sortItems(boxOfUnorganizedFruits);
    String[][] boxesOfOrganizedFruits = new String[10][10];

    String pointer = boxOfOrganizedFruits[0];
    int pointerCharLength = pointer.length();


    for (int i = 0; i < boxOfOrganizedFruits.length; i++) {
      String fruit = boxOfOrganizedFruits[i];
      int fruitCharLength = fruit.length();

      if (pointer.charAt(pointerCharLength - 1) != fruit.charAt(fruitCharLength - 1)) {
        pointer = fruit;
        containerBoxIndex++;
        boxIndex = 0;
      } 


      if (pointer.charAt(pointerCharLength - 1) == fruit.charAt(fruitCharLength - 1)) {
        boxesOfOrganizedFruits[containerBoxIndex][boxIndex] = fruit;
        boxIndex += 1;
      } 


    }

    System.out.println(Arrays.deepToString(boxesOfOrganizedFruits));
  }

  public static String[] sortItems(String[] items) {
    for (int i = 0; i < items.length; i++) {
      String temp = items[i];
      int position = i;

      while( position >= 1 && items[position - 1].charAt(0) > temp.charAt(0) ) {
        items[position] = items[position - 1];
        position--;
      }

      items[position] = temp;
    }

    return items;
  }

}
    
    

