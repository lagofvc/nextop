package com.lago.nextop.service.adapter.evernote;

import com.evernote.auth.EvernoteAuth;
import com.evernote.auth.EvernoteService;
import com.evernote.clients.ClientFactory;
import com.evernote.clients.NoteStoreClient;
import com.evernote.edam.error.EDAMSystemException;
import com.evernote.edam.error.EDAMUserException;
import com.evernote.edam.type.Notebook;
import com.evernote.thrift.TException;
import com.lago.nextop.NextAppException;

import javax.security.auth.login.LoginException;
import java.util.List;

/**
 * Created by lago on 4/3/16.
 */
public class EvernoteOperationsUtils {

    private static final String DEVTOKEN = "S=s1:U=9062e:E=15b374bb508:C=153df9a8880:P=1cd:A=en-devtoken:V=2:H=3bfa61520bbdf67ec1226110443f916c";

    private NoteStoreClient NOTESTORE;

    public static void main (String arg[]){
        try{
            // Set up the NoteStore client
            EvernoteAuth evernoteAuth = new EvernoteAuth(EvernoteService.SANDBOX, DEVTOKEN);
            ClientFactory factory = new ClientFactory(evernoteAuth);
            NoteStoreClient noteStore = factory.createNoteStoreClient();

            // Make API calls, passing the developer token as the authenticationToken param
            List<Notebook> notebooks = noteStore.listNotebooks();

            for (Notebook notebook : notebooks) {
                System.out.println("Notebook: " + notebook.getName());
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public EvernoteOperationsUtils() throws NextAppException{
        // Set up the NoteStore client
        EvernoteAuth evernoteAuth = new EvernoteAuth(EvernoteService.SANDBOX, DEVTOKEN);
        ClientFactory factory = new ClientFactory(evernoteAuth);
        try {
            NOTESTORE = factory.createNoteStoreClient();
        } catch (EDAMUserException | EDAMSystemException | TException e) {
            e.printStackTrace();
            throw new NextAppException(e.getMessage());
        }
    }

    /**
     * Performs the user login via Evernote API
     * Returns login Token from Evernote
     * @param username
     * @param password
     * @return
     */
    protected static String userLogin(String username, String password) throws LoginException {
        //TODO: really integrate with evernote... for now.
        if(username.equalsIgnoreCase("vcruz") == false ||
           password.equalsIgnoreCase("password") ==  false ){
            throw new LoginException("Invalid credentials ");
        }
        return DEVTOKEN;
    }
}