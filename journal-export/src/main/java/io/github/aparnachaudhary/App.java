package io.github.aparnachaudhary;

import org.apache.activemq.artemis.cli.commands.tools.XmlDataExporter;

/**
 * Print JMS Journal in XML format
 * 
 * @author Aparna Chaudhary
 */
public class App {

    public static void main(String[] args) {

        String jmsDataDir = "/Users/Aparna/dev/tools/wildfly-10.0.0.Final/standalone/data/activemq";
        String bindingsDir = jmsDataDir + "/bindings";
        String messageDir = jmsDataDir + "/journal";
        String largeMessageDir = jmsDataDir + "/largemessages";

        try {
            new XmlDataExporter().process(System.out, bindingsDir, messageDir, messageDir, largeMessageDir);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
