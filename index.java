
import java.util.ArrayList;
import java.util.List;

//exemplo de uma exibição de tabela simples

public class index {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        // add elementos no array
        names.add(
                "1 - Gestão Ambiental - A Kraft Heinz tem o orgulho de anunciar que, em 2025, a maioria de nossa eletricidade adquirida (para todas as instalações em todo o mundo) será de fontes renováveis.\r\n"
                        + "Comprometemo-nos a diminuir o uso de água em 20% nas fábricas da Kraft Heinz em áreas de alto risco e em 15% em todas as fábricas até 2025.\r\n"
                        + "Comprometemo-nos a diminuir o uso de energia em 15% em todas as instalações fabris da Kraft Heinz até 2025.\r\n"
                        + "Comprometemo-nos a reduzir o desperdício em 20% em todas as instalações fabris da Kraft Heinz até 2025.\r\n"
                        + "Comprometemo-nos a criar uma garrafa de Ketchup Heinz totalmente circular na Europa até 2022.\r\n"
                        + "Nosso objetivo é fazer embalagens 100% recicláveis, reutilizáveis ou compostáveis até 2025.\r\n");
        names.add(
                "2 - Abastecimento Sustentável - Comprometemo-nos a fornecer 100% dos tomates do Heinz Ketchup de maneira sustentável até 2025, de acordo com nossas Práticas de Agricultura Sustentável.\r\n"
                        + "Comprometemo-nos a adquirir óleo de palma 100% sustentável e de origem rastreável, até o moinho, até 2022.\r\n"
                        + "Nosso objetivo é obter 100% de ovos caipiras (“free-range eggs”) na Europa até 2020.\r\n"
                        + "Nosso objetivo é adquirir ovos de galinhas 100% livres de gaiolas (“cage-free eggs”) em todo o mundo até 2025.\r\n"
                        + "Comprometemo-nos a atualizar os Princípios de Orientação do Fornecedor e implementar auditorias de diligência de terceiros até 2021.\r\n");
        names.add(
                "3 - Vida Saúdavel e Apoio Comunitário - Comprometemo-nos a atingir 85% de conformidade com as metas globais de nutrição da Kraft Heinz até 2025.\r\n"
                        + "Comprometemo-nos a reduzir o açúcar total em nossos produtos em mais de 60 milhões de libras em nosso portfólio global até 2025.\r\n"
                        + "Comprometemo-nos a reduzir o sódio em 5% adicionais em nosso Barbecue e molhos para salada Kraft na América do Norte até 2025.\r\n"
                        + "Comprometemo-nos a melhorar o uso e a transparência de ingredientes mais simples até 2025.\r\n"
                        + "Comprometemo-nos a fornecer 1,5 bilhão de refeições às pessoas necessitadas até 2025.\r\n");

                        //buscar elemento pelo pelo indicice, usando get()
                        for(int i = 0; i < names.size(); i++) {
                            System.out.println(names.get(i));
                        }
    }

}
