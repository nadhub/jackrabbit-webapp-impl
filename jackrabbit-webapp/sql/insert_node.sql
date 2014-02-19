DROP PROCEDURE `insert_node`//
CREATE DEFINER=`root`@`localhost` PROCEDURE `insert_node`(IN inodeId VARCHAR(255), IN r_typeId INT,  IN r_label VARCHAR(255), IN r_lastModif VARCHAR(255), IN r_user VARCHAR(255), IN statusId VARCHAR(255))
BEGIN

INSERT INTO nodes (inode_id, record_type_id, record_label, record_last_modif, status_ID) VALUES(inodeId, r_typeId, r_label,, r_lastModif, r_user, statusId);

END

