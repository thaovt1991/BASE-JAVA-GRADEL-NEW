package jp.co.okasan.mapper;

import jp.co.okasan.domain.dto.ClientDTO;
import jp.co.okasan.entity.Client;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.ReportingPolicy;

import java.util.List;


@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface ClientMapper {

	ClientDTO toDto(Client entity);

	Client toEntity(ClientDTO dto);
	
	List<ClientDTO> map(List<Client> contents);

	@InheritInverseConfiguration(name = "toDto")
	void patch(ClientDTO dto, @MappingTarget Client entity);
	
}
