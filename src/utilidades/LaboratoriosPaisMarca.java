package utilidades;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;

/**
 *
 * @author Gonz@_
 */
public class LaboratoriosPaisMarca {

    public static String[] obtenerLaboratorios() {
        return new String[]{
            "Pfizer-BioNTech (Comirnaty)", "Moderna (Spikevax)", "Johnson & Johnson (Janssen)", "AstraZeneca (Vaxzevria)",
            "Sinopharm", "Sinovac (CoronaVac)", "Sputnik V", "Covaxin", "Covovax", "Covaxin (BBIBP-CorV)"
        };
    }

    public static String[] obtenerPaisesPorLaboratorio(String laboratorio) {
        if (laboratorio.equals("Pfizer-BioNTech (Comirnaty)")) {
            return new String[]{"EEUU", "Alemania"};
        } else if (laboratorio.equals("Moderna (Spikevax)")) {
            return new String[]{"EEUU"};
        } else if (laboratorio.equals("Johnson & Johnson (Janssen)")) {
            return new String[]{"EEUU"};
        } else if (laboratorio.equals("AstraZeneca (Vaxzevria)")) {
            return new String[]{"Reino Unido"};
        } else if (laboratorio.equals("Sinopharm")) {
            return new String[]{"China"};
        } else if (laboratorio.equals("Sinovac (CoronaVac)")) {
            return new String[]{"China"};
        } else if (laboratorio.equals("Sputnik V")) {
            return new String[]{"Rusia"};
        } else if (laboratorio.equals("Covaxin")) {
            return new String[]{"India"};
        } else if (laboratorio.equals("Covovax")) {
            return new String[]{"India"};
        } else if (laboratorio.equals("Covaxin (BBIBP-CorV)")) {
            return new String[]{"China"};
        }
        return new String[]{};
    }

    public static String[] obtenerMarcasPorLaboratorio(String laboratorio) {
        if (laboratorio.equals("Pfizer-BioNTech (Comirnaty)")) {
            return new String[]{"Pfizer y BioNTech"};
        } else if (laboratorio.equals("Moderna (Spikevax)")) {
            return new String[]{"Moderna"};
        } else if (laboratorio.equals("Johnson & Johnson (Janssen)")) {
            return new String[]{"Janssen Pharmaceuticals Companies"};
        } else if (laboratorio.equals("AstraZeneca (Vaxzevria)")) {
            return new String[]{"AstraZeneca & Universidad de Oxford"};
        } else if (laboratorio.equals("Sinopharm")) {
            return new String[]{"China National Pharmaceutical Group (Sinopharm)"};
        } else if (laboratorio.equals("Sinovac (CoronaVac)")) {
            return new String[]{"Sinovac Biotech"};
        } else if (laboratorio.equals("Sputnik V")) {
            return new String[]{"Instituto Gamaleya de Epidemiología y Microbiología"};
        } else if (laboratorio.equals("Covaxin")) {
            return new String[]{"Bharat Biotech"};
        } else if (laboratorio.equals("Covovax")) {
            return new String[]{"Novavax y producida en India por el Instituto de Suero"};
        } else if (laboratorio.equals("Covaxin (BBIBP-CorV)")) {
            return new String[]{"Instituto de Productos Biológicos de Pekín (BBIBP)"};
        }
        return new String[]{};
    }

    ///cargar los laboratorios en el ComboBox padre 
    public static void cargarLaboratorios(JComboBox<String> comboBox) {
        String[] laboratorios = obtenerLaboratorios();
        comboBox.setModel(new DefaultComboBoxModel<>(laboratorios));
    }

    // cargar los países en el ComboBox 
    public static void cargarPaises(JComboBox<String> comboBox, String laboratorioSeleccionado) {
        String[] paises = obtenerPaisesPorLaboratorio(laboratorioSeleccionado);
        comboBox.setModel(new DefaultComboBoxModel<>(paises));
    }

    //  cargar las marcas en el ComboBox de marca 
    public static void cargarMarcas(JComboBox<String> comboBox, String laboratorioSeleccionado) {
        String[] marcas = obtenerMarcasPorLaboratorio(laboratorioSeleccionado);
        comboBox.setModel(new DefaultComboBoxModel<>(marcas));
    }
}
