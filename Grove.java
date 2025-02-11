public class Grove {
    public Tree groupTrees[] = new Tree[16];
    public String groveName;

    public Grove(String groveName) {
        this.groveName = groveName;
    }

    public int plantTree(Tree tree) {
        for(int i = 0; i < groupTrees.length; i++) {
            if(groupTrees[i] == null) {
                groupTrees[i] = tree;
                return i;
            }
        }
        return -1;
    }

    public Tree uprootTree(int location) {
        Tree uproot = groupTrees[location];
        groupTrees[location] = null;
        return uproot;
    }

    public String toString() {
        String toPrint = "";
        for(int i = 0; i < groupTrees.length; i++) {
            if(groupTrees[i] != null) {
                toPrint += groupTrees[i].toString();
            }
        }
        return toPrint;
    }
}
