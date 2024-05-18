class Main {
    public static void main(String[] a) {
        System.out.println(new LL().Start());
    }
}

class Element {
    int Age;
    int Salary;
    boolean Married;

    public boolean Init(int v_Age, int v_Salary, boolean v_Married) {
        Age = v_Age;
        Salary = v_Salary;
        Married = v_Married;
        return true;
    }

    public int GetAge() {
        return Age;
    }

    public int GetSalary() {
        return Salary;
    }

    public boolean GetMarried() {
        return Married;
    }

    public boolean Equal(Element other) {
        boolean ret_val;
        int aux01;
        int aux02;
        int nt;
        ret_val = true;

        aux01 = other.GetAge();
        if (!this.Compare(aux01, Age)) ret_val = false;
        else {
            aux02 = other.GetSalary();
            if (!this.Compare(aux02, Salary)) ret_val = false;
            else if (Married) {
                if (!other.GetMarried()) ret_val = false;
                else nt = 0;
            } else {
                if (other.GetMarried()) ret_val = false;
                else nt = 0;
            }
        }

        return ret_val;
    }

    public boolean Compare(int num1, int num2) {
        boolean retval;
        int aux02;
        retval = false;
        aux02 = num2 + 1;
        if (num1 < num2) retval = false;
        else if (!(num1 < aux02)) retval = false;
        else retval = true;
        return retval;
    }
}

class Person extends Element {
    int PersonID;

    public boolean Init(int v_PersonID, int v_Age, int v_Salary, boolean v_Married) {
        PersonID = v_PersonID;
        Age = v_Age;
        Salary = v_Salary;
        Married = v_Married;
        return true;
    }

    public int GetPersonID() {
        return PersonID;
    }
}

class Student extends Person {
    int StudentID;

    public boolean Init(int v_PersonID, int v_Age, int v_Salary, boolean v_Married, int v_StudentID) {
        PersonID = v_PersonID;
        Age = v_Age;
        Salary = v_Salary;
        Married = v_Married;
        StudentID = v_StudentID;
        return true;
    }

    public int GetStudentID() {
        return StudentID;
    }
}

class Employee extends Element {
    int EmployeeID;

    public boolean Init(int v_EmployeeID, int v_Age, int v_Salary, boolean v_Married) {
        EmployeeID = v_EmployeeID;
        Age = v_Age;
        Salary = v_Salary;
        Married = v_Married;
        return true;
    }

    public int GetEmployeeID() {
        return EmployeeID;
    }
}

class List {
    Element elem;
    List next;
    boolean end;

    public boolean Init() {
        end = true;
        return true;
    }

    public boolean InitNew(Element v_elem, List v_next, boolean v_end) {
        end = v_end;
        elem = v_elem;
        next = v_next;
        return true;
    }

    public List Insert(Element new_elem) {
        boolean ret_val;
        List aux03;
        List aux02;
        aux03 = this;
        aux02 = new List();
        ret_val = aux02.InitNew(new_elem, aux03, false);
        return aux02;
    }

    public boolean SetNext(List v_next) {
        next = v_next;
        return true;
    }

    public List Delete(Element e) {
        List my_head;
        boolean ret_val;
        boolean aux05;
        List aux01;
        List prev;
        boolean var_end;
        Element var_elem;
        int aux04;
        int nt;

        my_head = this;
        ret_val = false;
        aux04 = 0 - 1;
        aux01 = this;
        prev = this;
        var_end = end;
        var_elem = elem;
        while ((!var_end) && (!ret_val)) {
            if (e.Equal(var_elem)) {
                ret_val = true;
                if (aux04 < 0) {
                    my_head = aux01.GetNext();
                } else {
                    System.out.println(0 - 555);
                    aux05 = prev.SetNext(aux01.GetNext());
                    System.out.println(0 - 555);
                }
            } else nt = 0;
            if (!ret_val) {
                prev = aux01;
                aux01 = aux01.GetNext();
                var_end = aux01.GetEnd();
                var_elem = aux01.GetElem();
                aux04 = 1;
            } else nt = 0;
        }
        return my_head;
    }

    public int Search(Element e) {
        int int_ret_val;
        List aux01;
        Element var_elem;
        boolean var_end;
        int nt;

        int_ret_val = 0;
        aux01 = this;
        var_end = end;
        var_elem = elem;
        while (!var_end) {
            if (e.Equal(var_elem)) {
                int_ret_val = 1;
            } else nt = 0;
            aux01 = aux01.GetNext();
            var_end = aux01.GetEnd();
            var_elem = aux01.GetElem();
        }
        return int_ret_val;
    }

    public boolean GetEnd() {
        return end;
    }

    public Element GetElem() {
        return elem;
    }

    public List GetNext() {
        return next;
    }

    public boolean Print() {
        List aux01;
        boolean var_end;
        Element var_elem;

        aux01 = this;
        var_end = end;
        var_elem = elem;
        while (!var_end) {
            System.out.println(var_elem.GetAge());
            aux01 = aux01.GetNext();
            var_end = aux01.GetEnd();
            var_elem = aux01.GetElem();
        }

        return true;
    }
}

class LL {
    public int Start() {
        List head;
        List last_elem;
        boolean aux01;
        Element el01;
        Person el02;
        Student el03;
        Employee el04;

        last_elem = new List();
        aux01 = last_elem.Init();
        head = last_elem;
        aux01 = head.Init();
        aux01 = head.Print();

        el01 = new Element();
        aux01 = el01.Init(25, 37000, false);
        head = head.Insert(el01);
        aux01 = head.Print();
        System.out.println(10000000);

        el02 = new Person();
        aux01 = el02.Init(1, 39, 42000, true);
        head = head.Insert(el02);
        aux01 = head.Print();
        System.out.println(10000000);

        el03 = new Student();
        aux01 = el03.Init(2, 22, 34000, false, 123456);
        head = head.Insert(el03);
        aux01 = head.Print();
        System.out.println(10000000);

        el04 = new Employee();
        aux01 = el04.Init(7890, 28, 35000, false);
        head = head.Insert(el04);
        aux01 = head.Print();
        System.out.println(2220000);

        head = head.Delete(el02);
        aux01 = head.Print();
        System.out.println(33300000);

        head = head.Delete(el01);
        aux01 = head.Print();
        System.out.println(44440000);

        return 0;
    }
}
