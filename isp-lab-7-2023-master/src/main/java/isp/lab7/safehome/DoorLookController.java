package isp.lab7.safehome;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

public class DoorLookController implements ControllerInterface {
    private final Map<Tenant,AccessKey> validAcces=new HashMap<>();
    Door door=new Door();
    @Override
    public DoorStatus enterPin(String pin) throws Exception, InvalidPinException {
        AccessKey accessKey=new AccessKey(pin);
        if(validAcces.containsValue(accessKey)) {
            return DoorStatus.OPEN;
        }
        else {
            throw new InvalidPinException();
        }
    }
    @Override
    public void addTenant(String pin,String name) throws Exception, TenantAlreadyExistsException {
        if(validAcces.containsKey(new Tenant(name))) {
            throw new TenantAlreadyExistsException();
        }
        validAcces.put(new Tenant(name),new AccessKey(pin));
    }
    @Override
    public void removeTenant(String name) throws Exception, TenantNotFoundException {
       if(validAcces.containsKey(new Tenant(name))) {
           validAcces.remove(new Tenant(name));
       }
       else {
           throw new TenantNotFoundException();
       }
    }
}
