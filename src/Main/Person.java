public class Person {
    private String name ;
    private int age;
    private String gender;

    public Person(String name,int age,String gender ){
        this.name=name;
        this.age=age;
        this.gender=gender;

        }


        public Person(String name)
    {
        this.name = name;
    }

        }
        public String getName ()
        {
            return this.name;
        }

        public int getAge ()
        {
        return this.age;
    }
        public String getGender () {
        return this.gender;

    }
        public void setAge ( int age){
        this.age = age;
    }

    }


