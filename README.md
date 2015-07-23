# android-TwoStateAdapter

#Details are coming soon..

## Package Path
hsh.lib.widgets.*;


## Adapter Constructors

```java

public BaseTwoStateAdapter(Context context, boolean isItemActivated, List<BaseTwoStateContentContainer> objects) {}

public BaseTwoStateAdapter(Context context, int resource, List<BaseTwoStateContentContainer> objects) {}

public BaseTwoStateAdapter(Context context, boolean isItemActivated, BaseTwoStateContentContainer[] objects) {}

public BaseTwoStateAdapter(Context context,  int resource, BaseTwoStateContentContainer[] objects) {}

```

## BaseTwoStateContentContainer Class Functions

```java

public String getFirstText(){}

public String getSecondText(){}

public void setFirstText(String text){}

public void setSecondText(String text){}

public void setText(String firstText,String secondText){}

public BaseTwoStateContentContainer setFirstTextAndReturnClass(String text){}

public BaseTwoStateContentContainer setSecondTextAndReturnClass(String text){}

public BaseTwoStateContentContainer setTextAndReturnClass(String firstText,String secondText){}

```

## How to Use

```java
public void howTo(){
//see example code
}
```

## Example Code

```java
public void impl(){

	ArrayList<BaseTwoStateContentContainer > list = new TwoStateList();
	list.add( new BaseTwoStateContentContainer().setTextAndReturnClass("upper text", "lower text"));
	
	    BaseTwoStateAdapter<BaseTwoStateContentContainer> ma = new BaseTwoStateAdapter<BaseTwoStateContentContainer>(mContext,false,list){
	    @Override
	protected void onBeforeItemSet(int position,  ViewGroup parent,View returnableParentView,TextView firstTextView,TextView secondTextView,BaseTwoStateContentContainer baseTwoStateContentContainer)	{
		// TODO: Implement this method
	}

	@Override
	protected void onAfterItemSet(int position,  ViewGroup parent,View returnableParentView,TextView firstTextView,TextView secondTextView,BaseTwoStateContentContainer baseTwoStateContentContainer)
	{
		// TODO: Implement this method
	}
	    };
	   listview.setAdapter(ma);
}
```

## Caution
 + If you use custom layout, you must include textviews of which view ids are android.R.id.text1(@android:id/text1) and anroid.R.id.text2(@android:id/text2) - 꼭 포함 되어야 합니다
 + If you don`t do this, you will get a NullpointerException.
 
## Sample Picture
![Sample](https://raw.githubusercontent.com/imscs21/android-TwoStateAdapter/master/sample/Sample_2015-07-23-16-08-43.png)


## License 

    Copyright 2015 HSH

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
