package com.taxiride;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class PassengerRequest extends LoggingActivity{

	
		 public void onCreate(Bundle savedInstanceState) {
		        super.onCreate(savedInstanceState);
		        setContentView(R.layout.passengerrequest);
		        TextView requestName = (TextView) findViewById(R.id.RequestName);
				requestName.setText("Request Name: " + ListOfRequest.TAXIREQUEST.getRequestName());
				
				TextView requestPhone = (TextView) findViewById(R.id.RequestPhone);  
				requestPhone.setText("Request Phone: " + ListOfRequest.TAXIREQUEST.getRequestPhoneNumber());
				
				TextView requestLocation = (TextView) findViewById(R.id.fromAddress);
				requestLocation.setText("PickUp Location: " + ListOfRequest.TAXIREQUEST.getRequestPickupLocation());
				
				TextView destination = (TextView) findViewById(R.id.toAddress);
				destination.setText("Destination: " + ListOfRequest.TAXIREQUEST.getRequestDestination());
				
				TextView totalPass = (TextView) findViewById(R.id.totalPass);
				totalPass.setText("Total Passengers: " + ListOfRequest.TAXIREQUEST.getTotalPeople());
				
				TextView status = (TextView) findViewById(R.id.status);
				
				if(ListOfRequest.TAXIREQUEST.isRequestFilled() == true)
				status.setText(" Assigned to: " + ListOfRequest.TAXIREQUEST.isRequestFilled());
				
				Button accept = (Button)findViewById(R.id.status);
				//accept
				
				
		 }
	
}