package fucksocks.server;

import java.net.Socket;
import java.util.List;
import java.util.Map;

/**
 * The interface <code>SessionManager</code> represents a session manager.
 *
 * @author Youchao Feng
 * @version 1.0
 * @date Sep 30, 2015 12:36 PM
 */
public interface SessionManager {

  Map<Long, Session> getAllManagedSessions();

  Session newSession(Socket socket);

  void addSessionListener(SessionListener sessionListener);

  void removeSessionListener(SessionListener sessionListener);

  void setSessionListeners(List<SessionListener> sessionListeners);

  List<SessionListener> getSessionListeners();

  Session getSession(long id);

}