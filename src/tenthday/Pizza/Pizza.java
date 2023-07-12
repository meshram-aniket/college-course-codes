package tenthday.Pizza;

import javax.imageio.plugins.jpeg.JPEGImageReadParam;

public class Pizza {
    String Types;
    String size;
    int topping;
    public void setTypes(String types) {
        this.Types = types;
    }

    public String getTypes() {
        return Types;
    }


    public void setSize(String size) {
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    public void setTopping(int topping) {
        this.topping = topping;
    }

    public int getTopping() {
        return topping;
    }

    public void display() {
        System.out.println("Size: "+getSize()+" "+"Type: "+getTypes());
    }

//
//    public Pizza computePrice(int topping, Pizza...p) {
////
//        int Topping = 20;
//        Pizza sum = (String)();
//        for (Pizza piz: p) {
//            if (piz.getSize() == "small" || piz.getTopping() == topping) {
//                sum += 20;
//            }
//            if (piz.getSize() == "medium") {
//                sum += 30;
//            }
//            if (piz.getSize() == "large") {
//                sum += 40;
//            }
//        }
//        return sum;
//    }


}

