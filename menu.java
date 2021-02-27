import java.awt.event.*;
class menu implements ActionListener{
    Event2 obj;
    menu(Event2 obj){
        this.obj=obj;
    }
    public void actionPerformed(ActionEvent e){
        obj.tf.setText("Welcome");
    }
}