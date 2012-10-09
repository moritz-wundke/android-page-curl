package com.mystictreegames.pagecurl;

import com.mystictreegames.pagecurl.R;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

public class PageAdapter extends BaseAdapter {
	private LayoutInflater mInflater;
	
	/**
	 * Constructor
	 * @param context
	 */
	public PageAdapter(Context context) {
		mInflater = LayoutInflater.from(context);
	}
	
	public int getCount() {
		// TODO Auto-generated method stub
		return 10;
	}

	public Object getItem(int position) {
		// TODO Auto-generated method stub
		return null;
	}

	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return position;
	}

	public View getView(int position, View convertView, ViewGroup parent) {
		View newView = convertView;
		if ( newView == null )
		{
			newView = mInflater.inflate(R.layout.list_item,parent,false);
		}
		return newView;
	}

}
