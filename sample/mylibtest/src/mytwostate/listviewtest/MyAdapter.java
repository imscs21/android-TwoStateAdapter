package mytwostate.listviewtest;

import hsh.lib.widgets.*;
import java.util.*;
import android.content.*;
import android.widget.*;
import android.view.*;

public class MyAdapter extends BaseTwoStateAdapter<BaseTwoStateContentContainer>
{
	public MyAdapter(Context ctx,ArrayList<BaseTwoStateContentContainer> list){
		super(ctx,false,list);
	}

	@Override
	protected void onBeforeItemSet(int p1, ViewGroup p3, View p4, TextView p5, TextView p6, BaseTwoStateContentContainer p7)
	{
		// TODO: Implement this method
	}

	@Override
	protected void onAfterItemSet(int p1, ViewGroup p2, View p3, TextView p4, TextView p5, BaseTwoStateContentContainer p6)
	{
		// TODO: Implement this method
	}


	
}
