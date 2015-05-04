package com.veontomo.refuel.tests;

import com.veontomo.refuel.R;
import com.veontomo.refuel.RefuelDataActivity;

import android.test.ActivityInstrumentationTestCase2;
import android.widget.TextView;

public class RefuelDataActivityTest extends
		ActivityInstrumentationTestCase2<RefuelDataActivity> {

	private RefuelDataActivity mRefuelDataActivity;
	private TextView mKmText;

	public RefuelDataActivityTest() {
		super(RefuelDataActivity.class);
	}

	@Override
	protected void setUp() throws Exception {
		super.setUp();
		mRefuelDataActivity = getActivity();
		mKmText = (TextView) mRefuelDataActivity
				.findViewById(R.id.km);
	}
	
	public void testPreconditions() {
	    assertNotNull("mFirstTestActivity is null", mRefuelDataActivity);
	    assertNotNull("mFirstTestText is null", mKmText);
	}

}
