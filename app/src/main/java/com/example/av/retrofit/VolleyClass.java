package com.example.av.retrofit;
import android.content.Context;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;

public class VolleyClass {
    private static VolleyClass instace;
    private RequestQueue mRequestQueue;
    private static Context context;
     public VolleyClass(Context context)
     {
         context=context;
         mRequestQueue=getRequestQueue();
     }
    public static synchronized VolleyClass getInstance(Context context){
        // If Instance is null then initialize new Instance
        if(instace == null){
            instace = new VolleyClass(context);
        }
        // Return MySingleton new Instance
        return instace;
    }

    public RequestQueue getRequestQueue(){
        // If RequestQueue is null the initialize new RequestQueue
        if(mRequestQueue == null){
            mRequestQueue = Volley.newRequestQueue(context.getApplicationContext());
        }

        // Return RequestQueue
        return mRequestQueue;
    }

    public<T> void addToRequestQueue(Request<T> request){
        // Add the specified request to the request queue
        getRequestQueue().add(request);
    }
}


