package Trees;

import java.util.ArrayList;

public class GenericTreeNode {
    String data;
    ArrayList<GenericTreeNode> children;

    public GenericTreeNode(String data){
        this.data = data;
        this.children = new ArrayList<GenericTreeNode>();
    }

    public void addChild(GenericTreeNode node){
        this.children.add(node);
    }

    public String print(int level){
        String ret;
        ret = "   ".repeat(level) + data + "\n";
        for(GenericTreeNode node : this.children){
            ret += node.print(level + 1);
        }
        return ret;
    }

}

/*
    public static void main(String[] args) {

        GenericTreeNode drinks = new GenericTreeNode("Drinks");

        GenericTreeNode hot = new GenericTreeNode("Hot");
        GenericTreeNode cold = new GenericTreeNode("Cold");

        GenericTreeNode tea = new GenericTreeNode("Tea");
        GenericTreeNode coffee = new GenericTreeNode("Coffee");

        GenericTreeNode wine = new GenericTreeNode("Wine");
        GenericTreeNode beer = new GenericTreeNode("Beer");
        GenericTreeNode bobaTea = new GenericTreeNode("Boba-Tea");

        GenericTreeNode beerA = new GenericTreeNode("Beer-A");
        GenericTreeNode beerB = new GenericTreeNode("Beer-B");

        drinks.addChild(hot);
        drinks.addChild(cold);

        hot.addChild(tea);
        hot.addChild(coffee);

        cold.addChild(wine);
        cold.addChild(beer);
        cold.addChild(bobaTea);

        beer.addChild(beerA);
        beer.addChild(beerB);

        System.out.println(drinks.print(0));

    }
 */

/*
Output:

Drinks
   Hot
      Tea
      Coffee
   Cold
      Wine
      Beer
         Beer-A
         Beer-B
      Boba-Tea


 */