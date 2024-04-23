package Map;

import java.util.HashMap;
import java.util.Set;

import Object.Persona;

public class ProvaMap {
    public static void main(String[] args) {
        HashMap<String,Persona> anagrafe = new HashMap<>();

        Persona p1 = new Persona("Roberto", "Bianchi", 26);
        Persona p2 = new Persona("Mario", "Rossi", 34);
        Persona p3 = new Persona("Carlo", "Verdi", 41);
        Persona p4 = new Persona("Mario", "Rossi", 34);
        Persona p5 = new Persona("Mario", "Rossi", 34);

        anagrafe.put("DSJGGS026FKKF4D",p1);
        anagrafe.put("FDHG33FFNKDMSMD",p2);
        anagrafe.put("DBDG5423321323K",p3);
        anagrafe.put("AFS43535VBDBDBG",p4);
        anagrafe.put("DBBGF4645645DBG",p5);

        System.out.println();
        System.out.println(anagrafe.get("WWRFFGHJKMNHGFJ"));
        System.out.println();
        System.out.println(anagrafe.get("AFS43535VBDBDBG"));

        //cerco il CF collegato a p2
        Set<String> codiciFiscali = anagrafe.keySet();  // restiruisce il set delle keys visto  che le key non hanno duplicati

        System.out.println();
        for (String chiave:codiciFiscali) {
            Persona p = anagrafe.get(chiave);
            if(p == p2 ){  // potrei usare equals ma in questo caso potrei avere dei CF ugali
                System.out.println(chiave);
            }
        }

    }
}
