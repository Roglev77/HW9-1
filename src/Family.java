import java.util.Arrays;

public class Family {
    private Human mother;
    private Human father;
    private Human[] children;
    private Pet pet;

    public Family(Human mother, Human father) {
        this.mother = mother;
        this.father = father;
        this.mother.setFamily(this);
        this.father.setFamily(this);
        this.children = new Human[0];
    }

    public Family(Human mother, Human father, Human... children) {
        this(mother, father);
        for (Human child : children) {
            addChild(child);
        }
    }

    public void addChild(Human child) {
        int length = this.children.length;
        Human[] newChildren = Arrays.copyOf(this.children, length + 1);
        newChildren[length] = child;
        this.children = newChildren;
        child.setFamily(this);
    }

    public boolean deleteChild(int index) {
        if (index < 0 || index >= this.children.length) {
            return false;
        } else {
            Human[] newChildren = new Human[this.children.length - 1];
            int newIndex = 0;
            for (int i = 0; i < this.children.length; i++) {
                if (i != index) {
                    newChildren[newIndex++] = this.children[i];
                }
            }
            this.children = newChildren;
            return true;
        }
    }

    public int countFamily() {
        return 2 + this.children.length;
    }

    @Override
    public String toString() {
        return "Family{" +
                "mother=" + mother +
                ", father=" + father +
                ", children=" + Arrays.toString(children) +
                ", pet=" + pet +
                '}';
    }
}
