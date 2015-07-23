package mytwostate.listviewtest;

import android.app.*;
import android.os.*;
import android.view.*;
import android.widget.*;
import hsh.lib.widgets.*;
import java.util.*;


public class MainActivity extends Activity
{
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
	{
        super.onCreate(savedInstanceState);
       // setContentView(R.layout.main);
	   SimpleTwoStateListView stslv = new SimpleTwoStateListView(this);
	ArrayList<BaseTwoStateContentContainer > al = new TwoStateList();
	for(int i = 1;i<101;i++){
		al.add( new BaseTwoStateContentContainer().setTextAndReturnClass(Integer.toString(i), Integer.toString(i)+"번째 설명"));
	}
	    MyAdapter ma = new MyAdapter(this,al);
	   stslv.setTwoStateAdapter(ma);
	   stslv.setOnItemClickListener(new AdapterView.OnItemClickListener(){
		   public void onItemClick(AdapterView<?> av,View v,int which,long arg){
			String msg= ((MyAdapter)av.getAdapter()).getItem(which).getSecondText();
			   Toast.makeText(MainActivity.this,msg,Toast.LENGTH_SHORT).show();
		   }
	   });
	   setContentView(stslv);
    }
}
