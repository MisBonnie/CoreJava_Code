package com.zzxx.f_ConstructorMethodReference;

public class Demo {
    public static void build(String name, PersonBuilder builder) {
        /*Person person = builder.builderPerson(name);
        System.out.println(person.getName());*/
        Person person = builder.builderPerson();
        System.out.println(person.getName());
    }

    public static void main(String[] args) {
//        build("赵丽颖",
//                name -> new Person(name));
        // 构造器本身是存在的
        build("赵丽颖", Person::new);

        /*build("赵丽颖",
                () -> new Person());*/

    }
}
