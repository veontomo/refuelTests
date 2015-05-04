package com.veontomo.refuel.tests;

import com.veontomo.refuel.R;
import com.veontomo.refuel.RefuelDataActivity;

import android.test.ActivityInstrumentationTestCase2;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class RefuelDataActivityTest extends
		ActivityInstrumentationTestCase2<RefuelDataActivity> {

	private RefuelDataActivity mRefuelDataActivity;
	private TextView mKmText;
	private EditText mKmInput;
	private TextView mPriceText;
	private EditText mPriceInput;
	private TextView mQuantityText;
	private EditText mQuantityInput;
	private TextView mPaidText;
	private EditText mPaidInput;
	private TextView mFuelStationText;
	private EditText mFuelStationInput;
	private Button mBtnSave;
	private Button mBtnCancel;

	public RefuelDataActivityTest() {
		super(RefuelDataActivity.class);
	}

	@Override
	protected void setUp() throws Exception {
		super.setUp();
		mRefuelDataActivity = getActivity();
		mKmText = (TextView) mRefuelDataActivity.findViewById(R.id.km);
		mKmInput = (EditText) mRefuelDataActivity.findViewById(R.id.kmInput);
		mPriceText = (TextView) mRefuelDataActivity.findViewById(R.id.price);
		mPriceInput = (EditText) mRefuelDataActivity
				.findViewById(R.id.priceInput);
		mQuantityText = (TextView) mRefuelDataActivity
				.findViewById(R.id.quantity);
		mQuantityInput = (EditText) mRefuelDataActivity
				.findViewById(R.id.quantityInput);
		mPaidText = (TextView) mRefuelDataActivity.findViewById(R.id.paid);
		mPaidInput = (EditText) mRefuelDataActivity
				.findViewById(R.id.paidInput);
		mFuelStationText = (TextView) mRefuelDataActivity
				.findViewById(R.id.fuelStation);
		mFuelStationInput = (EditText) mRefuelDataActivity
				.findViewById(R.id.fuelStationInput);
		mBtnSave = (Button) mRefuelDataActivity.findViewById(R.id.buttonSave);
		mBtnCancel = (Button) mRefuelDataActivity
				.findViewById(R.id.buttonCancel);
	}

	public void testPreconditions() {
		assertNotNull("Refuel Data Activity is missing", mRefuelDataActivity);
		assertNotNull("text view for \"km\" is missing", mKmText);
		assertNotNull("edit text for \"km\" is missing", mKmInput);
		assertNotNull("text view for \"price\" is missing", mPriceText);
		assertNotNull("edit text for \"price\" is missing", mPriceInput);
		assertNotNull("text view for \"quantity\" is missing", mQuantityText);
		assertNotNull("edit text for \"quantity\" is missing", mQuantityInput);
		assertNotNull("text view for \"paid\" is missing", mPaidText);
		assertNotNull("edit text for \"paid\" is missing", mPaidInput);
		assertNotNull("text view for \"fuel station\" is missing",
				mFuelStationText);
		assertNotNull("edit text for \"fuel station\" is missing",
				mFuelStationInput);
		assertNotNull("button \"Save\" is missing", mBtnSave);
		assertNotNull("button \"Cancel\" is missing", mBtnCancel);
	}

	public void testRefuelDataActivityKm() {
		final String expected = mRefuelDataActivity.getString(R.string.km);
		final String actual = mKmText.getText().toString();
		assertEquals(expected, actual);
	}

	public void testRefuelDataActivityPrice() {
		final String expected = mRefuelDataActivity.getString(R.string.price);
		final String actual = mPriceText.getText().toString();
		assertEquals(expected, actual);
	}

	public void testRefuelDataActivityQuantity() {
		final String expected = mRefuelDataActivity
				.getString(R.string.quantity);
		final String actual = mQuantityText.getText().toString();
		assertEquals(expected, actual);
	}

	public void testRefuelDataActivityPaid() {
		final String expected = mRefuelDataActivity.getString(R.string.paid);
		final String actual = mPaidText.getText().toString();
		assertEquals(expected, actual);
	}

	public void testRefuelDataActivityFuelStation() {
		final String expected = mRefuelDataActivity.getString(R.string.fuelStation);
		final String actual = mFuelStationText.getText().toString();
		assertEquals(expected, actual);
	}

}
