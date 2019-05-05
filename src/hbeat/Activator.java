package hbeat;

import org.osgi.framework.*;

public class Activator implements BundleActivator {


    @Override
    public void start(BundleContext context) throws Exception{


        Cache remote;

        remote = new Cache(2000);
        remote.startSyncThread();


        System.out.println("Pulkitt is jindaa");




        ////////////////////////////////// TEASTING /////////////////////////////
        Bundle a = remote.loadBundle("org.apache.aries.util");
        if(a != null){
            System.out.println("-- FOUND");
            System.out.println(remote.getJson(a));
        }
        else{
            System.out.println("-- NOT FOUND");
        }
        /////////////////////////////////////////////////////////////////////////

    }

    @Override
    public void stop(BundleContext context) throws Exception{

        System.out.println("margyaaa bc!");
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }



}




