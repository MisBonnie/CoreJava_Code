package com.zzxx.demo3;

public class Main {
    public static void main(String[] args) {
        Animal d = new Dog();
        d.eat();

        Animal c = new Cat();
        c.eat();

        // 想要调用cat中的catchMouse方法
        Cat cat = (Cat) c;
        cat.catchMouse();
        // 编译器看c是Animal类型, 和Dog是父子关系, 所以语法通过
        // 运行时, 发现c实际上是Cat, 不能转换成Dog, 提示ClassCastException
        if(c instanceof Dog) {
            Dog dog = (Dog) c;
            dog.watchHouse();
        }
        giveMePet(new Dog());
        giveMePet(new Cat());
    }
    // Animal作为返回值类型, 这个方法就可以返回多种不同种类的对象
    public Animal salePet() {
        return null;
    }
    // Animal作为参数, 可以传递多种类型的对象
    public static void giveMePet(Animal a){
        if (a instanceof Dog) {
            ((Dog) a).watchHouse();
        } else if (a instanceof Cat) {
            ((Cat) a).catchMouse();
        }
        a.eat();
    }
    /*public static void giveMePet(Dog d) {
        d.watchHouse();
        d.eat();
    }*/

    /*public static void giveMePet(Cat d) {
        d.catchMouse();
        d.eat();
    }*/

}
