public class PrintClass {

    public int toPrintVar = 33;

    public String print(){
        String updateVariable = String.format("\"---<%d>---\"%n", toPrintVar);
        System.out.println(updateVariable);
        return updateVariable;
    }
}
