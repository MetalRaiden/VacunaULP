package utilidades;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Gonz@_
 */
public class LabPaisMarca {
                        //          lab,              país  y marcas.
    private static Map<String, Map<String, String>> informacionVacunas = new HashMap<>();

    static {
        // completanos la info de los laboratorios, países y marcas...
        Map<String, String> pfizerInfo = new HashMap<>();
        pfizerInfo.put("Pais", "EEUU y Alemania");
        pfizerInfo.put("Marca", "Pfizer-BioNTech (Comirnaty)");
        informacionVacunas.put("Pfizer-BioNTech", pfizerInfo);

        Map<String, String> modernaInfo = new HashMap<>();
        modernaInfo.put("Pais", "EEUU");
        modernaInfo.put("Marca", "Moderna (Spikevax)");
        informacionVacunas.put("Moderna", modernaInfo);

        Map<String, String> janssenInfo = new HashMap<>();
        janssenInfo.put("Pais", "EEUU");
        janssenInfo.put("Marca", "Johnson & Johnson (Janssen)");
        informacionVacunas.put("Johnson & Johnson", janssenInfo);

        Map<String, String> astrazenecaInfo = new HashMap<>();
        astrazenecaInfo.put("Pais", "Reino Unido");
        astrazenecaInfo.put("Marca", "AstraZeneca (Vaxzevria)");
        informacionVacunas.put("AstraZeneca", astrazenecaInfo);

        Map<String, String> sinopharmInfo = new HashMap<>();
        sinopharmInfo.put("Pais", "China");
        sinopharmInfo.put("Marca", "Sinopharm");
        informacionVacunas.put("Sinopharm", sinopharmInfo);

        Map<String, String> sinovacInfo = new HashMap<>();
        sinovacInfo.put("Pais", "China");
        sinovacInfo.put("Marca", "Sinovac (CoronaVac)");
        informacionVacunas.put("Sinovac", sinovacInfo);

        Map<String, String> sputnikInfo = new HashMap<>();
        sputnikInfo.put("Pais", "Rusia");
        sputnikInfo.put("Marca", "Sputnik V");
        informacionVacunas.put("Sputnik V", sputnikInfo);

        Map<String, String> covaxinInfo = new HashMap<>();
        covaxinInfo.put("Pais", "India");
        covaxinInfo.put("Marca", "Covaxin");
        informacionVacunas.put("Covaxin", covaxinInfo);

        Map<String, String> covovaxInfo = new HashMap<>();
        covovaxInfo.put("Pais", "India");
        covovaxInfo.put("Marca", "Covovax");
        informacionVacunas.put("Covovax", covovaxInfo);

        Map<String, String> bbibpInfo = new HashMap<>();
        bbibpInfo.put("Pais", "China");
        bbibpInfo.put("Marca", "Covaxin (BBIBP-CorV)");
        informacionVacunas.put("Covaxin (BBIBP-CorV)", bbibpInfo);

    }

    public static String[] obtenerLaboratorios() {
        return informacionVacunas.keySet().toArray(new String[0]);
    }

    public static String obtenerPaisPorLaboratorio(String laboratorio) {
        if (informacionVacunas.containsKey(laboratorio)) {
            return informacionVacunas.get(laboratorio).get("Pais");
        }
        return "";
    }

    public static String obtenerMarcaPorLaboratorio(String laboratorio) {
        if (informacionVacunas.containsKey(laboratorio)) {
            return informacionVacunas.get(laboratorio).get("Marca");
        }
        return "";
    }
}
